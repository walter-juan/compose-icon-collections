package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Edgeimpulse: ImageVector
    get() {
        if (_edgeimpulse != null) {
            return _edgeimpulse!!
        }
        _edgeimpulse = Builder(name = "Edgeimpulse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.008f, 10.287f)
                horizontalLineToRelative(4.51f)
                lineToRelative(1.348f, 3.53f)
                horizontalLineToRelative(-5.858f)
                curveToRelative(-0.979f, 0.0f, -1.772f, -0.79f, -1.772f, -1.766f)
                reflectiveCurveToRelative(0.793f, -1.766f, 1.772f, -1.766f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(0.677f, 12.049f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, 1.773f, -1.766f)
                horizontalLineToRelative(8.597f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, 1.772f, 1.766f)
                curveToRelative(0.0f, 0.976f, -0.793f, 1.766f, -1.772f, 1.766f)
                horizontalLineTo(2.45f)
                curveToRelative(-0.98f, 0.0f, -1.773f, -0.79f, -1.773f, -1.766f)
                close()
                moveTo(24.0f, 19.613f)
                horizontalLineTo(4.448f)
                arcToRelative(2.515f, 2.515f, 0.0f, false, true, -1.93f, 0.899f)
                arcTo(2.514f, 2.514f, 0.0f, false, true, 0.0f, 18.002f)
                arcToRelative(2.514f, 2.514f, 0.0f, false, true, 2.518f, -2.509f)
                curveToRelative(0.775f, 0.0f, 1.467f, 0.351f, 1.93f, 0.899f)
                horizontalLineToRelative(18.321f)
                lineTo(24.0f, 19.613f)
                close()
                moveTo(19.594f, 7.655f)
                horizontalLineTo(4.404f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -1.886f, 0.852f)
                arcTo(2.514f, 2.514f, 0.0f, false, true, 0.0f, 5.998f)
                arcToRelative(2.514f, 2.514f, 0.0f, false, true, 2.518f, -2.51f)
                curveToRelative(0.797f, 0.0f, 1.506f, 0.371f, 1.967f, 0.946f)
                horizontalLineToRelative(13.878f)
                lineToRelative(1.231f, 3.221f)
                close()
            }
        }
        .build()
        return _edgeimpulse!!
    }

private var _edgeimpulse: ImageVector? = null
