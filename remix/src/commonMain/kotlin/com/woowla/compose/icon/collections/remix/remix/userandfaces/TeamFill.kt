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

public val UserAndFacesGroup.TeamFill: ImageVector
    get() {
        if (_teamFill != null) {
            return _teamFill!!
        }
        _teamFill = Builder(name = "TeamFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(14.209f, 10.0f, 16.0f, 8.209f, 16.0f, 6.0f)
                curveTo(16.0f, 3.791f, 14.209f, 2.0f, 12.0f, 2.0f)
                curveTo(9.791f, 2.0f, 8.0f, 3.791f, 8.0f, 6.0f)
                curveTo(8.0f, 8.209f, 9.791f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(5.5f, 13.0f)
                curveTo(6.881f, 13.0f, 8.0f, 11.881f, 8.0f, 10.5f)
                curveTo(8.0f, 9.119f, 6.881f, 8.0f, 5.5f, 8.0f)
                curveTo(4.119f, 8.0f, 3.0f, 9.119f, 3.0f, 10.5f)
                curveTo(3.0f, 11.881f, 4.119f, 13.0f, 5.5f, 13.0f)
                close()
                moveTo(21.0f, 10.5f)
                curveTo(21.0f, 11.881f, 19.881f, 13.0f, 18.5f, 13.0f)
                curveTo(17.119f, 13.0f, 16.0f, 11.881f, 16.0f, 10.5f)
                curveTo(16.0f, 9.119f, 17.119f, 8.0f, 18.5f, 8.0f)
                curveTo(19.881f, 8.0f, 21.0f, 9.119f, 21.0f, 10.5f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.761f, 11.0f, 17.0f, 13.239f, 17.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                curveTo(7.0f, 13.239f, 9.239f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(5.0f, 16.0f)
                curveTo(5.0f, 15.307f, 5.101f, 14.638f, 5.288f, 14.006f)
                lineTo(5.119f, 14.02f)
                curveTo(3.365f, 14.21f, 2.0f, 15.696f, 2.0f, 17.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(22.0f, 22.0f)
                verticalLineTo(17.5f)
                curveTo(22.0f, 15.638f, 20.546f, 14.115f, 18.712f, 14.006f)
                curveTo(18.899f, 14.638f, 19.0f, 15.307f, 19.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _teamFill!!
    }

private var _teamFill: ImageVector? = null
