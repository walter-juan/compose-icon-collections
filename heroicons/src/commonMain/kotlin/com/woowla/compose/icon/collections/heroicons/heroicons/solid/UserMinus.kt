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

public val SolidGroup.UserMinus: ImageVector
    get() {
        if (_userMinus != null) {
            return _userMinus!!
        }
        _userMinus = Builder(name = "UserMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.375f, 2.25f)
                curveTo(8.097f, 2.25f, 6.25f, 4.097f, 6.25f, 6.375f)
                curveTo(6.25f, 8.653f, 8.097f, 10.5f, 10.375f, 10.5f)
                curveTo(12.653f, 10.5f, 14.5f, 8.653f, 14.5f, 6.375f)
                curveTo(14.5f, 4.097f, 12.653f, 2.25f, 10.375f, 2.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.375f, 12.0f)
                curveTo(6.44f, 12.0f, 3.25f, 15.19f, 3.25f, 19.125f)
                curveTo(3.25f, 19.166f, 3.25f, 19.206f, 3.251f, 19.247f)
                curveTo(3.255f, 19.505f, 3.393f, 19.743f, 3.614f, 19.877f)
                curveTo(5.589f, 21.066f, 7.903f, 21.75f, 10.375f, 21.75f)
                curveTo(12.847f, 21.75f, 15.161f, 21.066f, 17.136f, 19.877f)
                curveTo(17.357f, 19.743f, 17.495f, 19.505f, 17.499f, 19.247f)
                curveTo(17.5f, 19.207f, 17.5f, 19.167f, 17.5f, 19.128f)
                verticalLineTo(19.125f)
                curveTo(17.5f, 15.19f, 14.31f, 12.0f, 10.375f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.75f)
                curveTo(15.586f, 9.75f, 15.25f, 10.086f, 15.25f, 10.5f)
                curveTo(15.25f, 10.914f, 15.586f, 11.25f, 16.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.414f, 11.25f, 22.75f, 10.914f, 22.75f, 10.5f)
                curveTo(22.75f, 10.086f, 22.414f, 9.75f, 22.0f, 9.75f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
