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

public val LogosGroup.BxlXing: ImageVector
    get() {
        if (_bxlXing != null) {
            return _bxlXing!!
        }
        _bxlXing = Builder(name = "BxlXing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.38f, 0.62f)
                lineToRelative(2.0f, 3.38f)
                lineToRelative(-3.06f, 5.4f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, 0.0f, 0.45f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, false, 0.38f, 0.19f)
                horizontalLineToRelative(2.87f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, 0.79f, -0.55f)
                reflectiveCurveToRelative(3.0f, -5.31f, 3.11f, -5.51f)
                lineToRelative(-2.0f, -3.46f)
                arcTo(0.91f, 0.91f, 0.0f, false, false, 7.92f, 6.0f)
                close()
                moveTo(17.16f, 2.0f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.77f, 0.55f)
                lineTo(10.0f, 13.93f)
                lineToRelative(4.09f, 7.52f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, 0.81f, 0.55f)
                horizontalLineToRelative(2.88f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, false, 0.38f, -0.18f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, 0.0f, -0.45f)
                lineToRelative(-4.07f, -7.43f)
                lineToRelative(6.36f, -11.31f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, 0.0f, -0.45f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, -0.38f, -0.18f)
                close()
            }
        }
        .build()
        return _bxlXing!!
    }

private var _bxlXing: ImageVector? = null
