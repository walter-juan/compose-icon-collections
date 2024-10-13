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

public val RegularGroup.BxEnvelope: ImageVector
    get() {
        if (_bxEnvelope != null) {
            return _bxEnvelope!!
        }
        _bxEnvelope = Builder(name = "BxEnvelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 6.0f)
                verticalLineToRelative(0.511f)
                lineToRelative(-8.0f, 6.223f)
                lineToRelative(-8.0f, -6.222f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(4.0f, 18.0f)
                lineTo(4.0f, 9.044f)
                lineToRelative(7.386f, 5.745f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, 1.228f, 0.0f)
                lineTo(20.0f, 9.044f)
                lineTo(20.002f, 18.0f)
                lineTo(4.0f, 18.0f)
                close()
            }
        }
        .build()
        return _bxEnvelope!!
    }

private var _bxEnvelope: ImageVector? = null
