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

public val OutlineGroup.UserMinus: ImageVector
    get() {
        if (_userMinus != null) {
            return _userMinus!!
        }
        _userMinus = Builder(name = "UserMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.5f)
                horizontalLineTo(16.0f)
                moveTo(13.75f, 6.375f)
                curveTo(13.75f, 8.239f, 12.239f, 9.75f, 10.375f, 9.75f)
                curveTo(8.511f, 9.75f, 7.0f, 8.239f, 7.0f, 6.375f)
                curveTo(7.0f, 4.511f, 8.511f, 3.0f, 10.375f, 3.0f)
                curveTo(12.239f, 3.0f, 13.75f, 4.511f, 13.75f, 6.375f)
                close()
                moveTo(4.001f, 19.234f)
                curveTo(4.0f, 19.198f, 4.0f, 19.162f, 4.0f, 19.125f)
                curveTo(4.0f, 15.604f, 6.854f, 12.75f, 10.375f, 12.75f)
                curveTo(13.896f, 12.75f, 16.75f, 15.604f, 16.75f, 19.125f)
                verticalLineTo(19.128f)
                curveTo(16.75f, 19.163f, 16.75f, 19.199f, 16.749f, 19.234f)
                curveTo(14.887f, 20.355f, 12.707f, 21.0f, 10.375f, 21.0f)
                curveTo(8.044f, 21.0f, 5.863f, 20.355f, 4.001f, 19.234f)
                close()
            }
        }
        .build()
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
