package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.ReceiptEuro: ImageVector
    get() {
        if (_receiptEuro != null) {
            return _receiptEuro!!
        }
        _receiptEuro = Builder(name = "ReceiptEuro", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.555f, 0.832f)
                lineToRelative(-2.318f, -1.545f)
                lineToRelative(-1.42f, 1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-1.293f, -1.292f)
                lineToRelative(-1.293f, 1.292f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-1.421f, -1.42f)
                lineToRelative(-2.317f, 1.545f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.55f, -0.72f)
                lineToRelative(-0.005f, -0.112f)
                verticalLineToRelative(-16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(13.125f, 6.0f)
                curveToRelative(-2.046f, 0.0f, -3.668f, 1.746f, -4.043f, 4.0f)
                horizontalLineToRelative(-0.082f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.082f)
                curveToRelative(0.376f, 2.254f, 1.997f, 4.0f, 4.043f, 4.0f)
                curveToRelative(1.106f, 0.0f, 2.053f, -0.465f, 2.707f, -1.445f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.664f, -1.11f)
                curveToRelative(-0.267f, 0.401f, -0.58f, 0.555f, -1.043f, 0.555f)
                curveToRelative(-0.882f, 0.0f, -1.7f, -0.814f, -2.002f, -1.999f)
                lineToRelative(1.877f, -0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-1.877f)
                curveToRelative(0.301f, -1.186f, 1.12f, -2.0f, 2.002f, -2.0f)
                curveToRelative(0.462f, 0.0f, 0.776f, 0.154f, 1.043f, 0.555f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.664f, -1.11f)
                curveToRelative(-0.654f, -0.98f, -1.6f, -1.445f, -2.707f, -1.445f)
            }
        }
        .build()
        return _receiptEuro!!
    }

private var _receiptEuro: ImageVector? = null
