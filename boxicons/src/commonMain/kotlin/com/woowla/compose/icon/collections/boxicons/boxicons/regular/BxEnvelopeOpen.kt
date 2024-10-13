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

public val RegularGroup.BxEnvelopeOpen: ImageVector
    get() {
        if (_bxEnvelopeOpen != null) {
            return _bxEnvelopeOpen!!
        }
        _bxEnvelopeOpen = Builder(name = "BxEnvelopeOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.555f, 8.168f)
                lineToRelative(-9.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.109f, 0.0f)
                lineToRelative(-9.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 9.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -0.334f, -0.167f, -0.646f, -0.445f, -0.832f)
                close()
                moveTo(12.0f, 4.202f)
                lineTo(19.197f, 9.0f)
                lineTo(12.0f, 13.798f)
                lineTo(4.803f, 9.0f)
                lineTo(12.0f, 4.202f)
                close()
                moveTo(4.0f, 20.0f)
                verticalLineToRelative(-9.131f)
                lineToRelative(7.445f, 4.963f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.11f, 0.0f)
                lineTo(20.0f, 10.869f)
                lineTo(19.997f, 20.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _bxEnvelopeOpen!!
    }

private var _bxEnvelopeOpen: ImageVector? = null
