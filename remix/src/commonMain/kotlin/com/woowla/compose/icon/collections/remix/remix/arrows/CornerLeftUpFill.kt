package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.CornerLeftUpFill: ImageVector
    get() {
        if (_cornerLeftUpFill != null) {
            return _cornerLeftUpFill!!
        }
        _cornerLeftUpFill = Builder(name = "CornerLeftUpFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(12.0f, 9.414f)
                horizontalLineTo(17.414f)
                lineTo(11.0f, 3.0f)
                lineTo(4.586f, 9.414f)
                lineTo(10.0f, 9.414f)
                lineTo(10.0f, 19.0f)
                close()
            }
        }
        .build()
        return _cornerLeftUpFill!!
    }

private var _cornerLeftUpFill: ImageVector? = null
