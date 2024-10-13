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

public val SolidGroup.BxsEnvelopeOpen: ImageVector
    get() {
        if (_bxsEnvelopeOpen != null) {
            return _bxsEnvelopeOpen!!
        }
        _bxsEnvelopeOpen = Builder(name = "BxsEnvelopeOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.555f, 8.168f)
                lineToRelative(-9.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.109f, 0.0f)
                lineToRelative(-9.0f, 6.0f)
                arcTo(0.995f, 0.995f, 0.0f, false, false, 2.004f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-0.004f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.441f, -0.832f)
                close()
                moveTo(20.0f, 12.7f)
                lineTo(12.0f, 17.0f)
                lineToRelative(-8.0f, -4.3f)
                verticalLineToRelative(-2.403f)
                lineToRelative(8.0f, 4.299f)
                lineToRelative(8.0f, -4.299f)
                verticalLineTo(12.7f)
                close()
            }
        }
        .build()
        return _bxsEnvelopeOpen!!
    }

private var _bxsEnvelopeOpen: ImageVector? = null
