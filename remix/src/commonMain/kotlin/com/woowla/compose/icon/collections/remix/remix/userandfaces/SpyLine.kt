package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.SpyLine: ImageVector
    get() {
        if (_spyLine != null) {
            return _spyLine!!
        }
        _spyLine = Builder(name = "SpyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 13.0f)
                curveTo(19.209f, 13.0f, 21.0f, 14.791f, 21.0f, 17.0f)
                curveTo(21.0f, 19.209f, 19.209f, 21.0f, 17.0f, 21.0f)
                curveTo(14.791f, 21.0f, 13.0f, 19.209f, 13.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 19.209f, 9.209f, 21.0f, 7.0f, 21.0f)
                curveTo(4.791f, 21.0f, 3.0f, 19.209f, 3.0f, 17.0f)
                curveTo(3.0f, 14.791f, 4.791f, 13.0f, 7.0f, 13.0f)
                curveTo(8.481f, 13.0f, 9.773f, 13.804f, 10.465f, 15.0f)
                horizontalLineTo(13.535f)
                curveTo(14.227f, 13.804f, 15.519f, 13.0f, 17.0f, 13.0f)
                close()
                moveTo(7.0f, 15.0f)
                curveTo(5.895f, 15.0f, 5.0f, 15.895f, 5.0f, 17.0f)
                curveTo(5.0f, 18.105f, 5.895f, 19.0f, 7.0f, 19.0f)
                curveTo(8.105f, 19.0f, 9.0f, 18.105f, 9.0f, 17.0f)
                curveTo(9.0f, 15.895f, 8.105f, 15.0f, 7.0f, 15.0f)
                close()
                moveTo(17.0f, 15.0f)
                curveTo(15.895f, 15.0f, 15.0f, 15.895f, 15.0f, 17.0f)
                curveTo(15.0f, 18.105f, 15.895f, 19.0f, 17.0f, 19.0f)
                curveTo(18.105f, 19.0f, 19.0f, 18.105f, 19.0f, 17.0f)
                curveTo(19.0f, 15.895f, 18.105f, 15.0f, 17.0f, 15.0f)
                close()
                moveTo(16.0f, 3.0f)
                curveTo(18.209f, 3.0f, 20.0f, 4.791f, 20.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 4.791f, 5.791f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(16.0f, 5.0f)
                horizontalLineTo(8.0f)
                curveTo(6.946f, 5.0f, 6.0f, 5.95f, 6.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 5.946f, 17.05f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _spyLine!!
    }

private var _spyLine: ImageVector? = null
