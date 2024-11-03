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

public val Twbs.Number9CircleFill: ImageVector
    get() {
        if (_number9CircleFill != null) {
            return _number9CircleFill!!
        }
        _number9CircleFill = Builder(name = "Number9CircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-8.223f, 4.146f)
                curveToRelative(2.104f, 0.0f, 3.123f, -1.464f, 3.123f, -4.3f)
                curveToRelative(0.0f, -3.147f, -1.459f, -4.014f, -2.97f, -4.014f)
                curveToRelative(-1.63f, 0.0f, -2.871f, 1.02f, -2.871f, 2.73f)
                curveToRelative(0.0f, 1.706f, 1.171f, 2.667f, 2.566f, 2.667f)
                curveToRelative(1.06f, 0.0f, 1.7f, -0.557f, 1.934f, -1.184f)
                horizontalLineToRelative(0.076f)
                curveToRelative(0.047f, 1.67f, -0.475f, 3.023f, -1.834f, 3.023f)
                curveToRelative(-0.71f, 0.0f, -1.149f, -0.363f, -1.248f, -0.72f)
                lineTo(5.258f, 10.348f)
                curveToRelative(0.094f, 0.908f, 0.926f, 1.798f, 2.52f, 1.798f)
                close()
                moveTo(7.895f, 8.174f)
                curveToRelative(0.808f, 0.0f, 1.535f, -0.528f, 1.535f, -1.594f)
                reflectiveCurveToRelative(-0.668f, -1.676f, -1.56f, -1.676f)
                curveToRelative(-0.838f, 0.0f, -1.517f, 0.616f, -1.517f, 1.659f)
                curveToRelative(0.0f, 1.072f, 0.708f, 1.61f, 1.54f, 1.61f)
                close()
            }
        }
        .build()
        return _number9CircleFill!!
    }

private var _number9CircleFill: ImageVector? = null
