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

public val BusinessGroup.RegisteredFill: ImageVector
    get() {
        if (_registeredFill != null) {
            return _registeredFill!!
        }
        _registeredFill = Builder(name = "RegisteredFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.5f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.217f)
                lineTo(14.397f, 17.0f)
                horizontalLineTo(16.869f)
                lineTo(14.319f, 13.491f)
                curveTo(15.327f, 12.876f, 16.0f, 11.767f, 16.0f, 10.5f)
                curveTo(16.0f, 8.631f, 14.536f, 7.105f, 12.692f, 7.005f)
                lineTo(12.5f, 7.0f)
                close()
                moveTo(12.5f, 9.0f)
                curveTo(13.28f, 9.0f, 13.92f, 9.595f, 13.993f, 10.356f)
                lineTo(14.0f, 10.5f)
                lineTo(13.993f, 10.644f)
                curveTo(13.925f, 11.358f, 13.358f, 11.925f, 12.644f, 11.993f)
                lineTo(12.5f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.5f)
                close()
            }
        }
        .build()
        return _registeredFill!!
    }

private var _registeredFill: ImageVector? = null
