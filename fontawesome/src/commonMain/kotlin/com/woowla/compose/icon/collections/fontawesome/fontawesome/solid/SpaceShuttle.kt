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

public val SolidGroup.SpaceShuttle: ImageVector
    get() {
        if (_spaceShuttle != null) {
            return _spaceShuttle!!
        }
        _spaceShuttle = Builder(name = "SpaceShuttle", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 368.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(50.0f, 0.0f)
                curveToRelative(40.6f, 0.0f, 80.4f, -11.0f, 115.2f, -31.9f)
                lineToRelative(133.5f, -80.1f)
                lineToRelative(-93.3f, 0.0f)
                lineToRelative(-64.9f, 38.9f)
                curveToRelative(-14.0f, 8.4f, -28.9f, 14.7f, -44.5f, 19.0f)
                lineToRelative(0.0f, -66.4f)
                curveToRelative(9.7f, -5.6f, 17.8f, -13.7f, 23.4f, -23.4f)
                lineToRelative(198.8f, 0.0f)
                curveToRelative(67.1f, 0.0f, 127.8f, -20.6f, 170.3f, -70.6f)
                curveToRelative(4.6f, -5.4f, 4.6f, -13.3f, 0.0f, -18.8f)
                curveToRelative(-42.5f, -50.1f, -103.2f, -70.6f, -170.3f, -70.6f)
                lineToRelative(-198.8f, 0.0f)
                curveToRelative(-5.6f, -9.7f, -13.7f, -17.8f, -23.4f, -23.4f)
                lineToRelative(0.0f, -66.4f)
                curveToRelative(15.6f, 4.2f, 30.6f, 10.6f, 44.5f, 19.0f)
                lineToRelative(64.9f, 38.9f)
                lineToRelative(93.3f, 0.0f)
                lineToRelative(-133.5f, -80.1f)
                curveTo(178.4f, 43.0f, 138.6f, 32.0f, 98.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                lineTo(0.0f, 368.0f)
                close()
                moveTo(96.0f, 368.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(48.0f, 0.0f)
                close()
                moveTo(96.0f, 80.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(48.0f, 0.0f)
                close()
                moveTo(416.0f, 224.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _spaceShuttle!!
    }

private var _spaceShuttle: ImageVector? = null
