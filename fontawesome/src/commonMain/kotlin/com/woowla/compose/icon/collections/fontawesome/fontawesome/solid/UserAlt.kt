package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.UserAlt: ImageVector
    get() {
        if (_userAlt != null) {
            return _userAlt!!
        }
        _userAlt = Builder(name = "UserAlt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 248.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, false, 0.0f, -240.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, false, 0.0f, 240.0f)
                close()
                moveTo(194.3f, 304.0f)
                curveTo(95.8f, 304.0f, 16.0f, 383.8f, 16.0f, 482.3f)
                curveTo(16.0f, 498.7f, 29.3f, 512.0f, 45.7f, 512.0f)
                lineToRelative(356.6f, 0.0f)
                curveToRelative(16.4f, 0.0f, 29.7f, -13.3f, 29.7f, -29.7f)
                curveToRelative(0.0f, -98.5f, -79.8f, -178.3f, -178.3f, -178.3f)
                lineToRelative(-59.4f, 0.0f)
                close()
            }
        }
        .build()
        return _userAlt!!
    }

private var _userAlt: ImageVector? = null
