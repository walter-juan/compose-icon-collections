package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.CheckLine: ImageVector
    get() {
        if (_checkLine != null) {
            return _checkLine!!
        }
        _checkLine = Builder(name = "CheckLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 15.171f)
                lineTo(19.192f, 5.979f)
                lineTo(20.606f, 7.393f)
                lineTo(10.0f, 17.999f)
                lineTo(3.636f, 11.635f)
                lineTo(5.05f, 10.221f)
                lineTo(10.0f, 15.171f)
                close()
            }
        }
        .build()
        return _checkLine!!
    }

private var _checkLine: ImageVector? = null
