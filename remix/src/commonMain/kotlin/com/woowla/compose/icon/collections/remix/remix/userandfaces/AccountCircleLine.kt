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

public val UserAndFacesGroup.AccountCircleLine: ImageVector
    get() {
        if (_accountCircleLine != null) {
            return _accountCircleLine!!
        }
        _accountCircleLine = Builder(name = "AccountCircleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.16f, 16.0f)
                curveTo(10.124f, 16.0f, 8.292f, 16.869f, 7.013f, 18.256f)
                curveTo(8.38f, 19.347f, 10.114f, 20.0f, 12.0f, 20.0f)
                curveTo(13.969f, 20.0f, 15.773f, 19.288f, 17.167f, 18.108f)
                curveTo(15.896f, 16.807f, 14.122f, 16.0f, 12.16f, 16.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 13.811f, 4.602f, 15.481f, 5.616f, 16.821f)
                curveTo(7.256f, 15.084f, 9.581f, 14.0f, 12.16f, 14.0f)
                curveTo(14.644f, 14.0f, 16.893f, 15.007f, 18.522f, 16.634f)
                curveTo(19.453f, 15.327f, 20.0f, 13.727f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(14.209f, 5.0f, 16.0f, 6.791f, 16.0f, 9.0f)
                curveTo(16.0f, 11.209f, 14.209f, 13.0f, 12.0f, 13.0f)
                curveTo(9.791f, 13.0f, 8.0f, 11.209f, 8.0f, 9.0f)
                curveTo(8.0f, 6.791f, 9.791f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(10.895f, 7.0f, 10.0f, 7.895f, 10.0f, 9.0f)
                curveTo(10.0f, 10.105f, 10.895f, 11.0f, 12.0f, 11.0f)
                curveTo(13.105f, 11.0f, 14.0f, 10.105f, 14.0f, 9.0f)
                curveTo(14.0f, 7.895f, 13.105f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _accountCircleLine!!
    }

private var _accountCircleLine: ImageVector? = null
