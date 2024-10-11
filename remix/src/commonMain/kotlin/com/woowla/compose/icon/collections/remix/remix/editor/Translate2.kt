package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.Translate2: ImageVector
    get() {
        if (_translate2 != null) {
            return _translate2!!
        }
        _translate2 = Builder(name = "Translate2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 10.0f)
                lineTo(22.9f, 21.0f)
                horizontalLineTo(20.745f)
                lineTo(19.544f, 18.0f)
                horizontalLineTo(15.454f)
                lineTo(14.255f, 21.0f)
                horizontalLineTo(12.101f)
                lineTo(16.5f, 10.0f)
                horizontalLineTo(18.5f)
                close()
                moveTo(10.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                lineTo(14.032f, 6.001f)
                curveTo(13.243f, 8.366f, 11.999f, 10.506f, 10.411f, 12.301f)
                curveTo(11.134f, 12.946f, 11.917f, 13.518f, 12.748f, 14.008f)
                lineTo(11.997f, 15.885f)
                curveTo(10.924f, 15.278f, 9.919f, 14.552f, 9.0f, 13.725f)
                curveTo(7.214f, 15.332f, 5.109f, 16.555f, 2.799f, 17.273f)
                lineTo(2.263f, 15.344f)
                curveTo(4.239f, 14.72f, 6.045f, 13.674f, 7.59f, 12.302f)
                curveTo(6.463f, 11.028f, 5.509f, 9.58f, 4.767f, 8.0f)
                lineTo(7.007f, 8.0f)
                curveTo(7.57f, 9.039f, 8.24f, 10.003f, 9.0f, 10.877f)
                curveTo(10.228f, 9.465f, 11.22f, 7.816f, 11.91f, 6.001f)
                lineTo(2.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(17.5f, 12.885f)
                lineTo(16.253f, 16.0f)
                horizontalLineTo(18.745f)
                lineTo(17.5f, 12.885f)
                close()
            }
        }
        .build()
        return _translate2!!
    }

private var _translate2: ImageVector? = null
