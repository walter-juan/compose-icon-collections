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

public val Twbs.QuestionOctagonFill: ImageVector
    get() {
        if (_questionOctagonFill != null) {
            return _questionOctagonFill!!
        }
        _questionOctagonFill = Builder(name = "QuestionOctagonFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.46f, 0.146f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.107f, 0.0f)
                lineTo(4.893f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.353f, 0.146f)
                lineTo(0.146f, 4.54f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 0.0f, 4.893f)
                verticalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.146f, 0.353f)
                lineToRelative(4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.353f, 0.146f)
                horizontalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.353f, -0.146f)
                lineToRelative(4.394f, -4.394f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.146f, -0.353f)
                lineTo(16.0f, 4.893f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.146f, -0.353f)
                close()
                moveTo(5.496f, 6.033f)
                arcToRelative(0.237f, 0.237f, 0.0f, false, true, -0.24f, -0.247f)
                curveTo(5.35f, 4.091f, 6.737f, 3.5f, 8.005f, 3.5f)
                curveToRelative(1.396f, 0.0f, 2.672f, 0.73f, 2.672f, 2.24f)
                curveToRelative(0.0f, 1.08f, -0.635f, 1.594f, -1.244f, 2.057f)
                curveToRelative(-0.737f, 0.559f, -1.01f, 0.768f, -1.01f, 1.486f)
                verticalLineToRelative(0.105f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.81f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.246f)
                lineToRelative(-0.004f, -0.217f)
                curveToRelative(-0.038f, -0.927f, 0.495f, -1.498f, 1.168f, -1.987f)
                curveToRelative(0.59f, -0.444f, 0.965f, -0.736f, 0.965f, -1.371f)
                curveToRelative(0.0f, -0.825f, -0.628f, -1.168f, -1.314f, -1.168f)
                curveToRelative(-0.803f, 0.0f, -1.253f, 0.478f, -1.342f, 1.134f)
                curveToRelative(-0.018f, 0.137f, -0.128f, 0.25f, -0.266f, 0.25f)
                horizontalLineToRelative(-0.825f)
                close()
                moveTo(7.821f, 12.476f)
                curveToRelative(-0.584f, 0.0f, -1.009f, -0.394f, -1.009f, -0.927f)
                curveToRelative(0.0f, -0.552f, 0.425f, -0.94f, 1.01f, -0.94f)
                curveToRelative(0.609f, 0.0f, 1.028f, 0.388f, 1.028f, 0.94f)
                curveToRelative(0.0f, 0.533f, -0.42f, 0.927f, -1.029f, 0.927f)
            }
        }
        .build()
        return _questionOctagonFill!!
    }

private var _questionOctagonFill: ImageVector? = null
