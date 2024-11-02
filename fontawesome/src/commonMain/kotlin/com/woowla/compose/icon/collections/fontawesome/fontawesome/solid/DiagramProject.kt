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

public val SolidGroup.DiagramProject: ImageVector
    get() {
        if (_diagramProject != null) {
            return _diagramProject!!
        }
        _diagramProject = Builder(name = "DiagramProject", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 80.0f)
                curveTo(0.0f, 53.5f, 21.5f, 32.0f, 48.0f, 32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-96.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -16.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 1.7f, -0.1f, 3.4f, -0.3f, 5.0f)
                lineTo(272.0f, 288.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-96.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -1.7f, 0.1f, -3.4f, 0.3f, -5.0f)
                lineTo(144.0f, 224.0f)
                lineToRelative(-96.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _diagramProject!!
    }

private var _diagramProject: ImageVector? = null
