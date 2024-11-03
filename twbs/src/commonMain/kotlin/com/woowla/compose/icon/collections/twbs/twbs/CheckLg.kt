package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CheckLg: ImageVector
    get() {
        if (_checkLg != null) {
            return _checkLg!!
        }
        _checkLg = Builder(name = "CheckLg", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.736f, 3.97f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, true, 1.047f, 0.0f)
                curveToRelative(0.286f, 0.289f, 0.29f, 0.756f, 0.01f, 1.05f)
                lineTo(7.88f, 12.01f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, true, -1.065f, 0.02f)
                lineTo(3.217f, 8.384f)
                arcToRelative(0.757f, 0.757f, 0.0f, false, true, 0.0f, -1.06f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, true, 1.047f, 0.0f)
                lineToRelative(3.052f, 3.093f)
                lineToRelative(5.4f, -6.425f)
                close()
            }
        }
        .build()
        return _checkLg!!
    }

private var _checkLg: ImageVector? = null
