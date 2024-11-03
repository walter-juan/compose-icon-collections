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

public val Twbs.TriangleHalf: ImageVector
    get() {
        if (_triangleHalf != null) {
            return _triangleHalf!!
        }
        _triangleHalf = Builder(name = "TriangleHalf", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.065f, 2.016f)
                arcTo(0.13f, 0.13f, 0.0f, false, false, 8.002f, 2.0f)
                verticalLineToRelative(11.983f)
                lineToRelative(6.856f, 0.017f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, false, 0.066f, -0.017f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, 0.054f, -0.06f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, -0.002f, -0.183f)
                lineTo(8.12f, 2.073f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, false, -0.054f, -0.057f)
                close()
                moveTo(7.022f, 1.566f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, true, 1.96f, 0.0f)
                lineToRelative(6.856f, 11.667f)
                curveToRelative(0.458f, 0.778f, -0.091f, 1.767f, -0.98f, 1.767f)
                lineTo(1.146f, 15.0f)
                curveToRelative(-0.889f, 0.0f, -1.437f, -0.99f, -0.98f, -1.767f)
                close()
            }
        }
        .build()
        return _triangleHalf!!
    }

private var _triangleHalf: ImageVector? = null
