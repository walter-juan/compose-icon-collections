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

public val ArrowsGroup.ExpandHeightLine: ImageVector
    get() {
        if (_expandHeightLine != null) {
            return _expandHeightLine!!
        }
        _expandHeightLine = Builder(name = "ExpandHeightLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(16.95f, 9.45f)
                lineTo(12.0f, 4.5f)
                lineTo(7.053f, 9.447f)
                lineTo(8.467f, 10.861f)
                lineTo(11.0f, 8.328f)
                verticalLineTo(15.671f)
                lineTo(8.465f, 13.136f)
                lineTo(7.051f, 14.55f)
                lineTo(12.0f, 19.5f)
                lineTo(16.95f, 14.55f)
                lineTo(15.535f, 13.136f)
                lineTo(13.0f, 15.672f)
                verticalLineTo(8.328f)
                lineTo(15.535f, 10.864f)
                lineTo(16.95f, 9.45f)
                close()
                moveTo(18.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _expandHeightLine!!
    }

private var _expandHeightLine: ImageVector? = null
