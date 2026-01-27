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

public val SolidGroup.DiagramPredecessor: ImageVector
    get() {
        if (_diagramPredecessor != null) {
            return _diagramPredecessor!!
        }
        _diagramPredecessor = Builder(name = "DiagramPredecessor", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(289.2f, 137.9f)
                curveToRelative(2.5f, -6.0f, 8.3f, -9.9f, 14.8f, -9.9f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, -24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-98.0f, 0.0f)
                curveToRelative(1.3f, 5.1f, 2.0f, 10.5f, 2.0f, 16.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-96.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, 32.2f, 72.0f, 72.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(40.0f, 0.0f)
                curveToRelative(6.5f, 0.0f, 12.3f, 3.9f, 14.8f, 9.9f)
                reflectiveCurveToRelative(1.1f, 12.9f, -3.5f, 17.4f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-4.6f, -4.6f, -5.9f, -11.5f, -3.5f, -17.4f)
                close()
                moveTo(384.0f, 352.0f)
                lineToRelative(-320.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(448.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _diagramPredecessor!!
    }

private var _diagramPredecessor: ImageVector? = null
