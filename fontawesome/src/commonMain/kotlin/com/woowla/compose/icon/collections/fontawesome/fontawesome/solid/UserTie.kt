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

public val SolidGroup.UserTie: ImageVector
    get() {
        if (_userTie != null) {
            return _userTie!!
        }
        _userTie = Builder(name = "UserTie", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 248.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, -240.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, 240.0f)
                close()
                moveTo(193.5f, 304.0f)
                lineToRelative(61.0f, 0.0f)
                curveToRelative(9.7f, 0.0f, 17.5f, 7.8f, 17.5f, 17.5f)
                curveToRelative(0.0f, 4.2f, -1.5f, 8.2f, -4.2f, 11.4f)
                lineToRelative(-27.4f, 32.0f)
                lineToRelative(31.0f, 115.1f)
                lineToRelative(0.6f, 0.0f)
                lineToRelative(34.6f, -138.5f)
                curveToRelative(2.2f, -8.7f, 11.1f, -14.0f, 19.5f, -10.8f)
                curveToRelative(61.9f, 23.6f, 105.9f, 83.6f, 105.9f, 153.8f)
                curveToRelative(0.0f, 15.1f, -12.3f, 27.4f, -27.4f, 27.4f)
                lineTo(43.4f, 512.0f)
                curveToRelative(-15.1f, 0.0f, -27.4f, -12.3f, -27.4f, -27.4f)
                curveToRelative(0.0f, -70.2f, 44.0f, -130.2f, 105.9f, -153.8f)
                curveToRelative(8.4f, -3.2f, 17.3f, 2.1f, 19.5f, 10.8f)
                lineToRelative(34.6f, 138.5f)
                lineToRelative(0.6f, 0.0f)
                lineToRelative(31.0f, -115.1f)
                lineToRelative(-27.4f, -32.0f)
                curveToRelative(-2.7f, -3.2f, -4.2f, -7.2f, -4.2f, -11.4f)
                curveToRelative(0.0f, -9.7f, 7.8f, -17.5f, 17.5f, -17.5f)
                close()
            }
        }
        .build()
        return _userTie!!
    }

private var _userTie: ImageVector? = null
