package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.DropletHalf: ImageVector
    get() {
        if (_dropletHalf != null) {
            return _dropletHalf!!
        }
        _dropletHalf = Builder(name = "DropletHalf", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.21f, 0.8f)
                curveTo(7.69f, 0.295f, 8.0f, 0.0f, 8.0f, 0.0f)
                quadToRelative(0.164f, 0.544f, 0.371f, 1.038f)
                curveToRelative(0.812f, 1.946f, 2.073f, 3.35f, 3.197f, 4.6f)
                curveTo(12.878f, 7.096f, 14.0f, 8.345f, 14.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                curveTo(2.0f, 6.668f, 5.58f, 2.517f, 7.21f, 0.8f)
                moveToRelative(0.413f, 1.021f)
                arcTo(31.0f, 31.0f, 0.0f, false, false, 5.794f, 3.99f)
                curveToRelative(-0.726f, 0.95f, -1.436f, 2.008f, -1.96f, 3.07f)
                curveTo(3.304f, 8.133f, 3.0f, 9.138f, 3.0f, 10.0f)
                curveToRelative(0.0f, 0.0f, 2.5f, 1.5f, 5.0f, 0.5f)
                reflectiveCurveToRelative(5.0f, -0.5f, 5.0f, -0.5f)
                curveToRelative(0.0f, -1.201f, -0.796f, -2.157f, -2.181f, -3.7f)
                lineToRelative(-0.03f, -0.032f)
                curveTo(9.75f, 5.11f, 8.5f, 3.72f, 7.623f, 1.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.553f, 7.776f)
                curveToRelative(0.82f, -1.641f, 1.717f, -2.753f, 2.093f, -3.13f)
                lineToRelative(0.708f, 0.708f)
                curveToRelative(-0.29f, 0.29f, -1.128f, 1.311f, -1.907f, 2.87f)
                close()
            }
        }
        .build()
        return _dropletHalf!!
    }

private var _dropletHalf: ImageVector? = null
