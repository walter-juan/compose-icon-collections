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

public val SolidGroup.BoxesStacked: ImageVector
    get() {
        if (_boxesStacked != null) {
            return _boxesStacked!!
        }
        _boxesStacked = Builder(name = "BoxesStacked", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 5.5f, -0.7f, 10.9f, -2.0f, 16.0f)
                lineToRelative(-252.0f, 0.0f)
                curveToRelative(-1.3f, -5.1f, -2.0f, -10.5f, -2.0f, -16.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(32.0f, 0.0f)
                close()
                moveTo(320.0f, 512.0f)
                curveToRelative(-11.2f, 0.0f, -21.8f, -2.9f, -31.0f, -8.0f)
                curveToRelative(9.5f, -16.5f, 15.0f, -35.6f, 15.0f, -56.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -20.4f, -5.5f, -39.5f, -15.0f, -56.0f)
                curveToRelative(9.2f, -5.1f, 19.7f, -8.0f, 31.0f, -8.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-128.0f, 0.0f)
                close()
                moveTo(0.0f, 320.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 320.0f)
                close()
            }
        }
        .build()
        return _boxesStacked!!
    }

private var _boxesStacked: ImageVector? = null
