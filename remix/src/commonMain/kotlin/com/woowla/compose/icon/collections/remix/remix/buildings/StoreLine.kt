package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.StoreLine: ImageVector
    get() {
        if (_storeLine != null) {
            return _storeLine!!
        }
        _storeLine = Builder(name = "StoreLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.646f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(11.646f)
                curveTo(2.378f, 10.941f, 2.0f, 10.014f, 2.0f, 9.0f)
                verticalLineTo(3.0f)
                curveTo(2.0f, 2.448f, 2.448f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 2.0f, 22.0f, 2.448f, 22.0f, 3.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 10.014f, 21.622f, 10.941f, 21.0f, 11.646f)
                close()
                moveTo(19.0f, 12.874f)
                curveTo(18.68f, 12.956f, 18.345f, 13.0f, 18.0f, 13.0f)
                curveTo(16.805f, 13.0f, 15.733f, 12.476f, 15.0f, 11.646f)
                curveTo(14.267f, 12.476f, 13.195f, 13.0f, 12.0f, 13.0f)
                curveTo(10.805f, 13.0f, 9.733f, 12.476f, 9.0f, 11.646f)
                curveTo(8.267f, 12.476f, 7.195f, 13.0f, 6.0f, 13.0f)
                curveTo(5.655f, 13.0f, 5.32f, 12.956f, 5.0f, 12.874f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.874f)
                close()
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 8.448f, 14.448f, 8.0f, 15.0f, 8.0f)
                curveTo(15.552f, 8.0f, 16.0f, 8.448f, 16.0f, 9.0f)
                curveTo(16.0f, 10.105f, 16.895f, 11.0f, 18.0f, 11.0f)
                curveTo(19.105f, 11.0f, 20.0f, 10.105f, 20.0f, 9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 10.105f, 4.895f, 11.0f, 6.0f, 11.0f)
                curveTo(7.105f, 11.0f, 8.0f, 10.105f, 8.0f, 9.0f)
                curveTo(8.0f, 8.448f, 8.448f, 8.0f, 9.0f, 8.0f)
                curveTo(9.552f, 8.0f, 10.0f, 8.448f, 10.0f, 9.0f)
                curveTo(10.0f, 10.105f, 10.895f, 11.0f, 12.0f, 11.0f)
                curveTo(13.105f, 11.0f, 14.0f, 10.105f, 14.0f, 9.0f)
                close()
            }
        }
        .build()
        return _storeLine!!
    }

private var _storeLine: ImageVector? = null
