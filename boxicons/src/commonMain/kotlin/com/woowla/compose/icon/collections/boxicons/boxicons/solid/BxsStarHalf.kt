package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsStarHalf: ImageVector
    get() {
        if (_bxsStarHalf != null) {
            return _bxsStarHalf!!
        }
        _bxsStarHalf = Builder(name = "BxsStarHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.025f, 20.775f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.555f, -0.168f)
                lineTo(12.0f, 18.202f)
                lineToRelative(5.445f, 3.63f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 1.517f, -1.106f)
                lineToRelative(-1.829f, -6.4f)
                lineToRelative(4.536f, -4.082f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.59f, -1.74f)
                lineToRelative(-5.701f, -0.454f)
                lineToRelative(-2.467f, -5.461f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -1.822f, -0.001f)
                lineTo(8.622f, 8.05f)
                lineToRelative(-5.701f, 0.453f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.619f, 1.713f)
                lineToRelative(4.214f, 4.107f)
                lineToRelative(-1.491f, 6.452f)
                close()
                moveTo(12.0f, 5.429f)
                lineToRelative(2.042f, 4.521f)
                lineToRelative(0.588f, 0.047f)
                horizontalLineToRelative(0.001f)
                lineToRelative(3.972f, 0.315f)
                lineToRelative(-3.271f, 2.944f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(-0.463f, 0.416f)
                lineToRelative(0.171f, 0.597f)
                verticalLineToRelative(0.003f)
                lineToRelative(1.253f, 4.385f)
                lineTo(12.0f, 15.798f)
                verticalLineTo(5.429f)
                close()
            }
        }
        .build()
        return _bxsStarHalf!!
    }

private var _bxsStarHalf: ImageVector? = null
