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

public val SolidGroup.BxsMessageRoundedX: ImageVector
    get() {
        if (_bxsMessageRoundedX != null) {
            return _bxsMessageRoundedX!!
        }
        _bxsMessageRoundedX = Builder(name = "BxsMessageRoundedX", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 5.589f, 2.0f, 10.0f)
                curveToRelative(0.0f, 2.907f, 1.897f, 5.515f, 5.0f, 6.934f)
                lineTo(7.0f, 22.0f)
                lineToRelative(5.34f, -4.005f)
                curveTo(17.697f, 17.853f, 22.0f, 14.32f, 22.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, -4.486f, -8.0f, -10.0f, -8.0f)
                close()
                moveTo(15.707f, 12.293f)
                lineTo(14.293f, 13.707f)
                lineTo(12.0f, 11.414f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(10.586f, 10.0f)
                lineTo(8.293f, 7.707f)
                lineToRelative(1.414f, -1.414f)
                lineTo(12.0f, 8.586f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.414f, 10.0f)
                lineToRelative(2.293f, 2.293f)
                close()
            }
        }
        .build()
        return _bxsMessageRoundedX!!
    }

private var _bxsMessageRoundedX: ImageVector? = null
