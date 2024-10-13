package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlSketch: ImageVector
    get() {
        if (_bxlSketch != null) {
            return _bxlSketch!!
        }
        _bxlSketch = Builder(name = "BxlSketch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.42f, 9.87f)
                lineTo(12.0f, 20.78f)
                lineToRelative(5.58f, -10.91f)
                lineTo(6.42f, 9.87f)
                close()
                moveTo(5.9f, 4.01f)
                lineTo(2.0f, 9.24f)
                horizontalLineToRelative(3.62f)
                lineToRelative(0.28f, -5.23f)
                close()
                moveTo(12.0f, 3.42f)
                lineTo(6.63f, 9.24f)
                horizontalLineToRelative(10.74f)
                lineTo(12.0f, 3.42f)
                close()
                moveTo(2.04f, 9.87f)
                lineToRelative(9.09f, 10.58f)
                lineTo(5.72f, 9.87f)
                lineTo(2.04f, 9.87f)
                close()
                moveTo(11.53f, 3.0f)
                horizontalLineToRelative(-0.15f)
                lineToRelative(-4.84f, 0.51f)
                arcToRelative(0.09f, 0.09f, 0.0f, false, true, 0.0f, 0.05f)
                lineToRelative(-0.27f, 5.15f)
                close()
                moveTo(12.87f, 20.45f)
                lineTo(21.96f, 9.87f)
                horizontalLineToRelative(-3.68f)
                lineToRelative(-5.41f, 10.58f)
                close()
                moveTo(17.45f, 3.58f)
                arcToRelative(0.09f, 0.09f, 0.0f, false, true, 0.0f, -0.05f)
                lineToRelative(-4.0f, -0.42f)
                lineToRelative(-1.0f, -0.11f)
                lineToRelative(5.26f, 5.71f)
                close()
                moveTo(18.1f, 4.01f)
                lineTo(18.38f, 9.24f)
                lineTo(22.0f, 9.24f)
                lineToRelative(-2.22f, -2.98f)
                lineToRelative(-1.68f, -2.25f)
                close()
            }
        }
        .build()
        return _bxlSketch!!
    }

private var _bxlSketch: ImageVector? = null
