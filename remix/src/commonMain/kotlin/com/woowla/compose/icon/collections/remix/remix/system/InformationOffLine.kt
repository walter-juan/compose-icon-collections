package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.InformationOffLine: ImageVector
    get() {
        if (_informationOffLine != null) {
            return _informationOffLine!!
        }
        _informationOffLine = Builder(name = "InformationOffLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                close()
                moveTo(16.906f, 18.32f)
                curveTo(15.551f, 19.373f, 13.849f, 20.0f, 12.0f, 20.0f)
                curveTo(7.582f, 20.0f, 4.0f, 16.418f, 4.0f, 12.0f)
                curveTo(4.0f, 10.151f, 4.627f, 8.449f, 5.68f, 7.094f)
                lineTo(10.0f, 11.414f)
                verticalLineTo(12.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.414f)
                lineTo(16.906f, 18.32f)
                close()
                moveTo(18.32f, 16.906f)
                lineTo(13.0f, 11.586f)
                verticalLineTo(10.5f)
                horizontalLineTo(11.914f)
                lineTo(7.094f, 5.68f)
                curveTo(8.449f, 4.627f, 10.151f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                curveTo(20.0f, 13.849f, 19.373f, 15.551f, 18.32f, 16.906f)
                close()
                moveTo(13.0f, 14.414f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.586f)
                lineTo(13.0f, 14.414f)
                close()
                moveTo(12.0f, 9.5f)
                curveTo(12.828f, 9.5f, 13.5f, 8.828f, 13.5f, 8.0f)
                curveTo(13.5f, 7.172f, 12.828f, 6.5f, 12.0f, 6.5f)
                curveTo(11.172f, 6.5f, 10.5f, 7.172f, 10.5f, 8.0f)
                curveTo(10.5f, 8.828f, 11.172f, 9.5f, 12.0f, 9.5f)
                close()
            }
        }
        .build()
        return _informationOffLine!!
    }

private var _informationOffLine: ImageVector? = null
