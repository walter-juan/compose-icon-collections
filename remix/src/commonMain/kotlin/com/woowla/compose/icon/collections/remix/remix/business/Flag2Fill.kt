package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.Flag2Fill: ImageVector
    get() {
        if (_flag2Fill != null) {
            return _flag2Fill!!
        }
        _flag2Fill = Builder(name = "Flag2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineTo(21.138f)
                curveTo(21.415f, 3.0f, 21.639f, 3.224f, 21.639f, 3.5f)
                curveTo(21.639f, 3.587f, 21.616f, 3.673f, 21.573f, 3.748f)
                lineTo(18.0f, 10.0f)
                lineTo(21.573f, 16.252f)
                curveTo(21.709f, 16.492f, 21.626f, 16.797f, 21.386f, 16.934f)
                curveTo(21.311f, 16.977f, 21.225f, 17.0f, 21.138f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _flag2Fill!!
    }

private var _flag2Fill: ImageVector? = null
