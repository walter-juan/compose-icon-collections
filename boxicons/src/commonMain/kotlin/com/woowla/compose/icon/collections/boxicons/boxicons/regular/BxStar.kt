package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxStar: ImageVector
    get() {
        if (_bxStar != null) {
            return _bxStar!!
        }
        _bxStar = Builder(name = "BxStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.516f, 14.323f)
                lineToRelative(-1.49f, 6.452f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 1.529f, 1.057f)
                lineTo(12.0f, 18.202f)
                lineToRelative(5.445f, 3.63f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 1.517f, -1.106f)
                lineToRelative(-1.829f, -6.4f)
                lineToRelative(4.536f, -4.082f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.59f, -1.74f)
                lineToRelative(-5.701f, -0.454f)
                lineToRelative(-2.467f, -5.461f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -1.822f, 0.0f)
                lineTo(8.622f, 8.05f)
                lineToRelative(-5.701f, 0.453f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.619f, 1.713f)
                lineToRelative(4.214f, 4.107f)
                close()
                moveTo(9.369f, 9.997f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.832f, -0.586f)
                lineTo(12.0f, 5.43f)
                lineToRelative(1.799f, 3.981f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.832f, 0.586f)
                lineToRelative(3.972f, 0.315f)
                lineToRelative(-3.271f, 2.944f)
                curveToRelative(-0.284f, 0.256f, -0.397f, 0.65f, -0.293f, 1.018f)
                lineToRelative(1.253f, 4.385f)
                lineToRelative(-3.736f, -2.491f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, -1.109f, 0.0f)
                lineToRelative(-3.904f, 2.603f)
                lineToRelative(1.05f, -4.546f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.276f, -0.94f)
                lineToRelative(-3.038f, -2.962f)
                lineToRelative(4.09f, -0.326f)
                close()
            }
        }
        .build()
        return _bxStar!!
    }

private var _bxStar: ImageVector? = null
