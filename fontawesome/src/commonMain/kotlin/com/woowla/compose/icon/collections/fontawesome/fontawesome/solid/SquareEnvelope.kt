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

public val SolidGroup.SquareEnvelope: ImageVector
    get() {
        if (_squareEnvelope != null) {
            return _squareEnvelope!!
        }
        _squareEnvelope = Builder(name = "SquareEnvelope", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(209.1f, 267.9f)
                lineTo(108.4f, 207.4f)
                curveToRelative(-7.7f, -4.6f, -12.4f, -12.9f, -12.4f, -21.9f)
                curveToRelative(0.0f, -14.1f, 11.4f, -25.5f, 25.5f, -25.5f)
                lineToRelative(204.9f, 0.0f)
                curveToRelative(14.1f, 0.0f, 25.5f, 11.4f, 25.5f, 25.5f)
                curveToRelative(0.0f, 9.0f, -4.7f, 17.3f, -12.4f, 21.9f)
                lineTo(238.9f, 267.9f)
                curveToRelative(-4.5f, 2.7f, -9.6f, 4.1f, -14.9f, 4.1f)
                reflectiveCurveToRelative(-10.4f, -1.4f, -14.9f, -4.1f)
                close()
                moveTo(352.0f, 237.3f)
                lineToRelative(0.0f, 82.7f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-192.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -82.7f)
                lineToRelative(96.7f, 58.0f)
                curveTo(202.1f, 301.0f, 213.0f, 304.0f, 224.0f, 304.0f)
                reflectiveCurveToRelative(21.9f, -3.0f, 31.3f, -8.7f)
                lineToRelative(96.7f, -58.0f)
                close()
            }
        }
        .build()
        return _squareEnvelope!!
    }

private var _squareEnvelope: ImageVector? = null
