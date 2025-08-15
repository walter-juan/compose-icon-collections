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

public val SolidGroup.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 56.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                lineToRelative(24.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-29.8f, 0.0f, -54.9f, -20.4f, -62.0f, -48.0f)
                curveToRelative(-0.7f, 0.0f, -1.3f, 0.0f, -2.0f, 0.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -18.0f, 6.0f, -34.6f, 16.0f, -48.0f)
                curveToRelative(-19.4f, -14.6f, -32.0f, -37.8f, -32.0f, -64.0f)
                curveToRelative(0.0f, -30.9f, 17.6f, -57.8f, 43.2f, -71.1f)
                curveToRelative(-7.1f, -12.0f, -11.2f, -26.0f, -11.2f, -40.9f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                lineToRelative(0.0f, -24.0f)
                close()
                moveTo(392.0f, 56.0f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 15.0f, -4.1f, 29.0f, -11.2f, 40.9f)
                curveToRelative(25.7f, 13.3f, 43.2f, 40.1f, 43.2f, 71.1f)
                curveToRelative(0.0f, 26.2f, -12.6f, 49.4f, -32.0f, 64.0f)
                curveToRelative(10.0f, 13.4f, 16.0f, 30.0f, 16.0f, 48.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                curveToRelative(-0.7f, 0.0f, -1.3f, 0.0f, -2.0f, 0.0f)
                curveToRelative(-7.1f, 27.6f, -32.2f, 48.0f, -62.0f, 48.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -448.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(24.0f, 0.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
