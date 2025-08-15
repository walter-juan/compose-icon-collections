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

public val SolidGroup.VanShuttle: ImageVector
    get() {
        if (_vanShuttle != null) {
            return _vanShuttle!!
        }
        _vanShuttle = Builder(name = "VanShuttle", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                curveTo(28.7f, 64.0f, 0.0f, 92.7f, 0.0f, 128.0f)
                lineTo(0.0f, 336.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(0.4f, 0.0f)
                curveToRelative(4.0f, 44.9f, 41.7f, 80.0f, 87.6f, 80.0f)
                reflectiveCurveToRelative(83.6f, -35.1f, 87.6f, -80.0f)
                lineToRelative(104.7f, 0.0f)
                curveToRelative(4.0f, 44.9f, 41.7f, 80.0f, 87.6f, 80.0f)
                curveToRelative(46.1f, 0.0f, 83.9f, -35.4f, 87.7f, -80.5f)
                curveToRelative(31.7f, -3.8f, 56.3f, -30.8f, 56.3f, -63.5f)
                lineToRelative(0.0f, -101.3f)
                curveToRelative(0.0f, -13.8f, -4.5f, -27.3f, -12.8f, -38.4f)
                lineToRelative(-80.0f, -106.7f)
                curveTo(471.1f, 73.5f, 452.1f, 64.0f, 432.0f, 64.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(504.0f, 224.0f)
                lineToRelative(-120.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(72.0f, 96.0f)
                close()
                moveTo(64.0f, 224.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(-96.0f, 0.0f)
                close()
                moveTo(224.0f, 224.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(-96.0f, 0.0f)
                close()
                moveTo(392.0f, 392.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
                close()
                moveTo(152.0f, 352.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, 80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -80.0f)
                close()
            }
        }
        .build()
        return _vanShuttle!!
    }

private var _vanShuttle: ImageVector? = null
