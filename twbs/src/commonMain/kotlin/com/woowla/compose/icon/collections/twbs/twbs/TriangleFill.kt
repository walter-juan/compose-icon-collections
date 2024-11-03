package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.TriangleFill: ImageVector
    get() {
        if (_triangleFill != null) {
            return _triangleFill!!
        }
        _triangleFill = Builder(name = "TriangleFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.022f, 1.566f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, true, 1.96f, 0.0f)
                lineToRelative(6.857f, 11.667f)
                curveToRelative(0.457f, 0.778f, -0.092f, 1.767f, -0.98f, 1.767f)
                horizontalLineTo(1.144f)
                curveToRelative(-0.889f, 0.0f, -1.437f, -0.99f, -0.98f, -1.767f)
                close()
            }
        }
        .build()
        return _triangleFill!!
    }

private var _triangleFill: ImageVector? = null
