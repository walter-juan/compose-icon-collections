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

public val SolidGroup.BxsQuoteLeft: ImageVector
    get() {
        if (_bxsQuoteLeft != null) {
            return _bxsQuoteLeft!!
        }
        _bxsQuoteLeft = Builder(name = "BxsQuoteLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.691f, 6.292f)
                curveTo(5.094f, 4.771f, 7.217f, 4.0f, 10.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.819f)
                lineToRelative(-0.804f, 0.161f)
                curveToRelative(-1.37f, 0.274f, -2.323f, 0.813f, -2.833f, 1.604f)
                arcTo(2.902f, 2.902f, 0.0f, false, false, 6.925f, 10.0f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(0.003f, -2.919f)
                curveToRelative(-0.009f, -0.111f, -0.199f, -2.741f, 1.688f, -4.789f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(0.003f, -2.919f)
                curveToRelative(-0.009f, -0.111f, -0.199f, -2.741f, 1.688f, -4.789f)
                curveTo(16.094f, 4.771f, 18.217f, 4.0f, 21.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.819f)
                lineToRelative(-0.804f, 0.161f)
                curveToRelative(-1.37f, 0.274f, -2.323f, 0.813f, -2.833f, 1.604f)
                arcTo(2.902f, 2.902f, 0.0f, false, false, 17.925f, 10.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsQuoteLeft!!
    }

private var _bxsQuoteLeft: ImageVector? = null
