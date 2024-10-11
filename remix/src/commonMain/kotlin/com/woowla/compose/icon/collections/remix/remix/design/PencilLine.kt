package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) {
            return _pencilLine!!
        }
        _pencilLine = Builder(name = "PencilLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.728f, 9.576f)
                lineTo(14.314f, 8.162f)
                lineTo(5.0f, 17.476f)
                verticalLineTo(18.89f)
                horizontalLineTo(6.414f)
                lineTo(15.728f, 9.576f)
                close()
                moveTo(17.142f, 8.162f)
                lineTo(18.556f, 6.748f)
                lineTo(17.142f, 5.334f)
                lineTo(15.728f, 6.748f)
                lineTo(17.142f, 8.162f)
                close()
                moveTo(7.243f, 20.89f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.647f)
                lineTo(16.435f, 3.212f)
                curveTo(16.826f, 2.822f, 17.459f, 2.822f, 17.849f, 3.212f)
                lineTo(20.678f, 6.041f)
                curveTo(21.068f, 6.431f, 21.068f, 7.064f, 20.678f, 7.455f)
                lineTo(7.243f, 20.89f)
                close()
            }
        }
        .build()
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
