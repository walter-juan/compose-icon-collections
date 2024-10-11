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

public val BusinessGroup.MegaphoneLine: ImageVector
    get() {
        if (_megaphoneLine != null) {
            return _megaphoneLine!!
        }
        _megaphoneLine = Builder(name = "MegaphoneLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                curveTo(9.0f, 17.0f, 16.0f, 18.0f, 19.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 21.0f, 21.0f, 20.552f, 21.0f, 20.0f)
                verticalLineTo(13.937f)
                curveTo(21.863f, 13.715f, 22.5f, 12.932f, 22.5f, 12.0f)
                curveTo(22.5f, 11.068f, 21.863f, 10.285f, 21.0f, 10.063f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.448f, 20.552f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(16.0f, 6.0f, 9.0f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 7.0f, 3.0f, 7.895f, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.105f, 3.895f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(6.0f)
                lineTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(11.0f, 8.661f)
                curveTo(11.683f, 8.515f, 12.528f, 8.312f, 13.439f, 8.044f)
                curveTo(15.118f, 7.55f, 17.25f, 6.773f, 19.0f, 5.575f)
                verticalLineTo(18.425f)
                curveTo(17.25f, 17.227f, 15.118f, 16.45f, 13.439f, 15.956f)
                curveTo(12.528f, 15.688f, 11.683f, 15.485f, 11.0f, 15.339f)
                verticalLineTo(8.661f)
                close()
                moveTo(5.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _megaphoneLine!!
    }

private var _megaphoneLine: ImageVector? = null
