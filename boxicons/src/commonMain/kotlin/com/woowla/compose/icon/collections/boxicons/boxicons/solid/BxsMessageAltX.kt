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

public val SolidGroup.BxsMessageAltX: ImageVector
    get() {
        if (_bxsMessageAltX != null) {
            return _bxsMessageAltX!!
        }
        _bxsMessageAltX = Builder(name = "BxsMessageAltX", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.5f, 18.0f)
                lineToRelative(3.5f, 4.0f)
                lineToRelative(3.5f, -4.0f)
                horizontalLineTo(19.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(7.293f, 6.707f)
                lineToRelative(1.414f, -1.414f)
                lineTo(12.0f, 8.586f)
                lineToRelative(3.293f, -3.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.414f, 10.0f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(12.0f, 11.414f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(10.586f, 10.0f)
                lineTo(7.293f, 6.707f)
                close()
            }
        }
        .build()
        return _bxsMessageAltX!!
    }

private var _bxsMessageAltX: ImageVector? = null
