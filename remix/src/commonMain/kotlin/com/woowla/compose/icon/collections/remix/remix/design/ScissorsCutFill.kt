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

public val DesignGroup.ScissorsCutFill: ImageVector
    get() {
        if (_scissorsCutFill != null) {
            return _scissorsCutFill!!
        }
        _scissorsCutFill = Builder(name = "ScissorsCutFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.879f, 11.997f)
                lineTo(7.562f, 9.68f)
                curveTo(7.082f, 9.884f, 6.554f, 9.997f, 6.0f, 9.997f)
                curveTo(3.791f, 9.997f, 2.0f, 8.206f, 2.0f, 5.997f)
                curveTo(2.0f, 3.788f, 3.791f, 1.997f, 6.0f, 1.997f)
                curveTo(8.209f, 1.997f, 10.0f, 3.788f, 10.0f, 5.997f)
                curveTo(10.0f, 6.551f, 9.887f, 7.079f, 9.683f, 7.559f)
                lineTo(12.0f, 9.875f)
                lineTo(18.374f, 3.501f)
                curveTo(19.155f, 2.72f, 20.422f, 2.72f, 21.203f, 3.501f)
                lineTo(21.91f, 4.208f)
                lineTo(9.683f, 16.435f)
                curveTo(9.887f, 16.914f, 10.0f, 17.442f, 10.0f, 17.997f)
                curveTo(10.0f, 20.206f, 8.209f, 21.997f, 6.0f, 21.997f)
                curveTo(3.791f, 21.997f, 2.0f, 20.206f, 2.0f, 17.997f)
                curveTo(2.0f, 15.788f, 3.791f, 13.997f, 6.0f, 13.997f)
                curveTo(6.554f, 13.997f, 7.082f, 14.109f, 7.562f, 14.313f)
                lineTo(9.879f, 11.997f)
                close()
                moveTo(6.0f, 7.997f)
                curveTo(7.105f, 7.997f, 8.0f, 7.101f, 8.0f, 5.997f)
                curveTo(8.0f, 4.892f, 7.105f, 3.997f, 6.0f, 3.997f)
                curveTo(4.895f, 3.997f, 4.0f, 4.892f, 4.0f, 5.997f)
                curveTo(4.0f, 7.101f, 4.895f, 7.997f, 6.0f, 7.997f)
                close()
                moveTo(6.0f, 19.997f)
                curveTo(7.105f, 19.997f, 8.0f, 19.101f, 8.0f, 17.997f)
                curveTo(8.0f, 16.892f, 7.105f, 15.997f, 6.0f, 15.997f)
                curveTo(4.895f, 15.997f, 4.0f, 16.892f, 4.0f, 17.997f)
                curveTo(4.0f, 19.101f, 4.895f, 19.997f, 6.0f, 19.997f)
                close()
                moveTo(15.535f, 13.41f)
                lineTo(21.91f, 19.785f)
                lineTo(21.203f, 20.492f)
                curveTo(20.422f, 21.273f, 19.155f, 21.273f, 18.374f, 20.492f)
                lineTo(13.413f, 15.531f)
                lineTo(15.535f, 13.41f)
                close()
                moveTo(16.0f, 10.997f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.997f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.997f)
                close()
                moveTo(20.0f, 10.997f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.997f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.997f)
                close()
                moveTo(6.0f, 10.997f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.997f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.997f)
                close()
                moveTo(2.0f, 10.997f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.997f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.997f)
                close()
            }
        }
        .build()
        return _scissorsCutFill!!
    }

private var _scissorsCutFill: ImageVector? = null
