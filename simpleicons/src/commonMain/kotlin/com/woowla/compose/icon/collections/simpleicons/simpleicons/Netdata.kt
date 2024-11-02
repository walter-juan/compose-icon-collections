package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Netdata: ImageVector
    get() {
        if (_netdata != null) {
            return _netdata!!
        }
        _netdata = Builder(name = "Netdata", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.764f, 21.827f)
                horizontalLineTo(9.922f)
                lineTo(0.0f, 2.173f)
                horizontalLineToRelative(14.084f)
                curveToRelative(5.476f, 0.01f, 9.913f, 4.565f, 9.916f, 10.183f)
                curveToRelative(-0.009f, 5.235f, -4.14f, 9.47f, -9.238f, 9.47f)
                close()
            }
        }
        .build()
        return _netdata!!
    }

private var _netdata: ImageVector? = null
