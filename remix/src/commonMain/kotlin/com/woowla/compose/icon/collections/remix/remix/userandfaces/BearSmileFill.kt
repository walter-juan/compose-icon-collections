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

public val UserAndFacesGroup.BearSmileFill: ImageVector
    get() {
        if (_bearSmileFill != null) {
            return _bearSmileFill!!
        }
        _bearSmileFill = Builder(name = "BearSmileFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.0f)
                curveTo(19.985f, 2.0f, 22.0f, 4.015f, 22.0f, 6.5f)
                curveTo(22.0f, 7.856f, 21.4f, 9.072f, 20.451f, 9.897f)
                curveTo(20.806f, 10.864f, 21.0f, 11.91f, 21.0f, 13.0f)
                curveTo(21.0f, 17.971f, 16.971f, 22.0f, 12.0f, 22.0f)
                curveTo(7.029f, 22.0f, 3.0f, 17.971f, 3.0f, 13.0f)
                curveTo(3.0f, 11.91f, 3.194f, 10.864f, 3.549f, 9.897f)
                curveTo(2.6f, 9.072f, 2.0f, 7.856f, 2.0f, 6.5f)
                curveTo(2.0f, 4.015f, 4.015f, 2.0f, 6.5f, 2.0f)
                curveTo(8.126f, 2.0f, 9.55f, 2.862f, 10.341f, 4.154f)
                curveTo(10.877f, 4.053f, 11.433f, 4.0f, 12.0f, 4.0f)
                curveTo(12.567f, 4.0f, 13.123f, 4.053f, 13.661f, 4.153f)
                curveTo(14.45f, 2.862f, 15.875f, 2.0f, 17.5f, 2.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 15.209f, 9.791f, 17.0f, 12.0f, 17.0f)
                curveTo(14.209f, 17.0f, 16.0f, 15.209f, 16.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 14.105f, 13.105f, 15.0f, 12.0f, 15.0f)
                curveTo(10.895f, 15.0f, 10.0f, 14.105f, 10.0f, 13.0f)
                close()
            }
        }
        .build()
        return _bearSmileFill!!
    }

private var _bearSmileFill: ImageVector? = null
