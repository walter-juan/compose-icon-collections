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

public val EditorGroup.Bold: ImageVector
    get() {
        if (_bold != null) {
            return _bold!!
        }
        _bold = Builder(name = "Bold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 11.0f, 15.0f, 9.881f, 15.0f, 8.5f)
                curveTo(15.0f, 7.119f, 13.881f, 6.0f, 12.5f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(18.0f, 15.5f)
                curveTo(18.0f, 17.985f, 15.985f, 20.0f, 13.5f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.5f)
                curveTo(14.985f, 4.0f, 17.0f, 6.015f, 17.0f, 8.5f)
                curveTo(17.0f, 9.704f, 16.527f, 10.798f, 15.756f, 11.606f)
                curveTo(17.098f, 12.385f, 18.0f, 13.837f, 18.0f, 15.5f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 18.0f, 16.0f, 16.881f, 16.0f, 15.5f)
                curveTo(16.0f, 14.119f, 14.881f, 13.0f, 13.5f, 13.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bold!!
    }

private var _bold: ImageVector? = null
