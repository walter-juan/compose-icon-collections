package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.UserPlus: ImageVector
    get() {
        if (_userPlus != null) {
            return _userPlus!!
        }
        _userPlus = Builder(name = "UserPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 6.375f)
                curveTo(5.25f, 4.097f, 7.097f, 2.25f, 9.375f, 2.25f)
                curveTo(11.653f, 2.25f, 13.5f, 4.097f, 13.5f, 6.375f)
                curveTo(13.5f, 8.653f, 11.653f, 10.5f, 9.375f, 10.5f)
                curveTo(7.097f, 10.5f, 5.25f, 8.653f, 5.25f, 6.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.25f, 19.125f)
                curveTo(2.25f, 15.19f, 5.44f, 12.0f, 9.375f, 12.0f)
                curveTo(13.31f, 12.0f, 16.5f, 15.19f, 16.5f, 19.125f)
                verticalLineTo(19.128f)
                curveTo(16.5f, 19.167f, 16.5f, 19.207f, 16.499f, 19.247f)
                curveTo(16.495f, 19.505f, 16.357f, 19.743f, 16.136f, 19.877f)
                curveTo(14.161f, 21.066f, 11.847f, 21.75f, 9.375f, 21.75f)
                curveTo(6.903f, 21.75f, 4.589f, 21.066f, 2.614f, 19.877f)
                curveTo(2.393f, 19.743f, 2.255f, 19.505f, 2.251f, 19.247f)
                curveTo(2.25f, 19.206f, 2.25f, 19.166f, 2.25f, 19.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 7.5f)
                curveTo(18.75f, 7.086f, 18.414f, 6.75f, 18.0f, 6.75f)
                curveTo(17.586f, 6.75f, 17.25f, 7.086f, 17.25f, 7.5f)
                verticalLineTo(9.75f)
                horizontalLineTo(15.0f)
                curveTo(14.586f, 9.75f, 14.25f, 10.086f, 14.25f, 10.5f)
                curveTo(14.25f, 10.914f, 14.586f, 11.25f, 15.0f, 11.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(13.5f)
                curveTo(17.25f, 13.914f, 17.586f, 14.25f, 18.0f, 14.25f)
                curveTo(18.414f, 14.25f, 18.75f, 13.914f, 18.75f, 13.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(21.0f)
                curveTo(21.414f, 11.25f, 21.75f, 10.914f, 21.75f, 10.5f)
                curveTo(21.75f, 10.086f, 21.414f, 9.75f, 21.0f, 9.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
