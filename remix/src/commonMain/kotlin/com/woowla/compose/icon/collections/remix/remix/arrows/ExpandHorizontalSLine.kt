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

public val ArrowsGroup.ExpandHorizontalSLine: ImageVector
    get() {
        if (_expandHorizontalSLine != null) {
            return _expandHorizontalSLine!!
        }
        _expandHorizontalSLine = Builder(name = "ExpandHorizontalSLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.45f, 7.05f)
                lineTo(2.5f, 12.0f)
                lineTo(7.447f, 16.947f)
                lineTo(8.861f, 15.533f)
                lineTo(6.328f, 13.0f)
                horizontalLineTo(17.671f)
                lineTo(15.136f, 15.535f)
                lineTo(16.55f, 16.949f)
                lineTo(21.5f, 12.0f)
                lineTo(16.55f, 7.05f)
                lineTo(15.136f, 8.464f)
                lineTo(17.672f, 11.0f)
                horizontalLineTo(6.328f)
                lineTo(8.864f, 8.465f)
                lineTo(7.45f, 7.05f)
                close()
            }
        }
        .build()
        return _expandHorizontalSLine!!
    }

private var _expandHorizontalSLine: ImageVector? = null
