package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.UserPlus: ImageVector
    get() {
        if (_userPlus != null) {
            return _userPlus!!
        }
        _userPlus = Builder(name = "UserPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 7.5f)
                verticalLineTo(10.5f)
                moveTo(18.0f, 10.5f)
                verticalLineTo(13.5f)
                moveTo(18.0f, 10.5f)
                horizontalLineTo(21.0f)
                moveTo(18.0f, 10.5f)
                horizontalLineTo(15.0f)
                moveTo(12.75f, 6.375f)
                curveTo(12.75f, 8.239f, 11.239f, 9.75f, 9.375f, 9.75f)
                curveTo(7.511f, 9.75f, 6.0f, 8.239f, 6.0f, 6.375f)
                curveTo(6.0f, 4.511f, 7.511f, 3.0f, 9.375f, 3.0f)
                curveTo(11.239f, 3.0f, 12.75f, 4.511f, 12.75f, 6.375f)
                close()
                moveTo(3.001f, 19.234f)
                curveTo(3.0f, 19.198f, 3.0f, 19.162f, 3.0f, 19.125f)
                curveTo(3.0f, 15.604f, 5.854f, 12.75f, 9.375f, 12.75f)
                curveTo(12.896f, 12.75f, 15.75f, 15.604f, 15.75f, 19.125f)
                verticalLineTo(19.128f)
                curveTo(15.75f, 19.163f, 15.75f, 19.199f, 15.749f, 19.234f)
                curveTo(13.887f, 20.355f, 11.707f, 21.0f, 9.375f, 21.0f)
                curveTo(7.044f, 21.0f, 4.863f, 20.355f, 3.001f, 19.234f)
                close()
            }
        }
        .build()
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
