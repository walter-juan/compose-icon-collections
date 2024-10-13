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

public val LogosGroup.BxlDeviantart: ImageVector
    get() {
        if (_bxlDeviantart != null) {
            return _bxlDeviantart!!
        }
        _bxlDeviantart = Builder(name = "BxlDeviantart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.57f, 3.0f)
                horizontalLineToRelative(-3.271f)
                lineToRelative(-0.326f, 0.33f)
                lineToRelative(-1.544f, 2.942f)
                lineToRelative(-0.486f, 0.327f)
                horizontalLineTo(6.432f)
                verticalLineToRelative(4.495f)
                horizontalLineToRelative(3.03f)
                lineToRelative(0.27f, 0.327f)
                lineToRelative(-3.3f, 6.305f)
                verticalLineToRelative(3.273f)
                horizontalLineToRelative(3.272f)
                lineToRelative(0.327f, -0.33f)
                lineToRelative(1.543f, -2.943f)
                lineToRelative(0.486f, -0.326f)
                horizontalLineToRelative(5.511f)
                verticalLineToRelative(-4.495f)
                horizontalLineToRelative(-3.03f)
                lineToRelative(-0.269f, -0.329f)
                lineToRelative(3.299f, -6.303f)
                lineTo(17.57f, 3.0f)
                close()
            }
        }
        .build()
        return _bxlDeviantart!!
    }

private var _bxlDeviantart: ImageVector? = null
