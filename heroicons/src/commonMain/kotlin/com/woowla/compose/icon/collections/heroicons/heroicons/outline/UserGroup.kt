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

public val OutlineGroup.UserGroup: ImageVector
    get() {
        if (_userGroup != null) {
            return _userGroup!!
        }
        _userGroup = Builder(name = "UserGroup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.719f)
                curveTo(18.247f, 18.74f, 18.498f, 18.75f, 18.751f, 18.75f)
                curveTo(19.799f, 18.75f, 20.805f, 18.571f, 21.741f, 18.241f)
                curveTo(21.747f, 18.162f, 21.751f, 18.081f, 21.751f, 18.0f)
                curveTo(21.751f, 16.343f, 20.407f, 15.0f, 18.751f, 15.0f)
                curveTo(18.123f, 15.0f, 17.54f, 15.193f, 17.059f, 15.522f)
                moveTo(18.0f, 18.719f)
                curveTo(18.0f, 18.729f, 18.0f, 18.74f, 18.0f, 18.75f)
                curveTo(18.0f, 18.975f, 17.988f, 19.197f, 17.963f, 19.416f)
                curveTo(16.207f, 20.424f, 14.171f, 21.0f, 12.0f, 21.0f)
                curveTo(9.829f, 21.0f, 7.793f, 20.424f, 6.037f, 19.416f)
                curveTo(6.012f, 19.197f, 6.0f, 18.975f, 6.0f, 18.75f)
                curveTo(6.0f, 18.74f, 6.0f, 18.729f, 6.0f, 18.719f)
                moveTo(18.0f, 18.719f)
                curveTo(17.994f, 17.543f, 17.649f, 16.446f, 17.059f, 15.522f)
                moveTo(17.059f, 15.522f)
                curveTo(15.993f, 13.855f, 14.125f, 12.75f, 12.0f, 12.75f)
                curveTo(9.875f, 12.75f, 8.008f, 13.855f, 6.942f, 15.522f)
                moveTo(6.942f, 15.522f)
                curveTo(6.46f, 15.193f, 5.878f, 15.0f, 5.251f, 15.0f)
                curveTo(3.594f, 15.0f, 2.251f, 16.343f, 2.251f, 18.0f)
                curveTo(2.251f, 18.081f, 2.254f, 18.162f, 2.26f, 18.241f)
                curveTo(3.196f, 18.571f, 4.202f, 18.75f, 5.251f, 18.75f)
                curveTo(5.503f, 18.75f, 5.753f, 18.74f, 6.0f, 18.719f)
                moveTo(6.942f, 15.522f)
                curveTo(6.351f, 16.446f, 6.006f, 17.542f, 6.0f, 18.719f)
                moveTo(15.0f, 6.75f)
                curveTo(15.0f, 8.407f, 13.657f, 9.75f, 12.0f, 9.75f)
                curveTo(10.343f, 9.75f, 9.0f, 8.407f, 9.0f, 6.75f)
                curveTo(9.0f, 5.093f, 10.343f, 3.75f, 12.0f, 3.75f)
                curveTo(13.657f, 3.75f, 15.0f, 5.093f, 15.0f, 6.75f)
                close()
                moveTo(21.0f, 9.75f)
                curveTo(21.0f, 10.993f, 19.993f, 12.0f, 18.75f, 12.0f)
                curveTo(17.507f, 12.0f, 16.5f, 10.993f, 16.5f, 9.75f)
                curveTo(16.5f, 8.507f, 17.507f, 7.5f, 18.75f, 7.5f)
                curveTo(19.993f, 7.5f, 21.0f, 8.507f, 21.0f, 9.75f)
                close()
                moveTo(7.5f, 9.75f)
                curveTo(7.5f, 10.993f, 6.493f, 12.0f, 5.25f, 12.0f)
                curveTo(4.007f, 12.0f, 3.0f, 10.993f, 3.0f, 9.75f)
                curveTo(3.0f, 8.507f, 4.007f, 7.5f, 5.25f, 7.5f)
                curveTo(6.493f, 7.5f, 7.5f, 8.507f, 7.5f, 9.75f)
                close()
            }
        }
        .build()
        return _userGroup!!
    }

private var _userGroup: ImageVector? = null
