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

public val UserAndFacesGroup.User6Line: ImageVector
    get() {
        if (_user6Line != null) {
            return _user6Line!!
        }
        _user6Line = Builder(name = "User6Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(15.662f, 17.0f, 18.865f, 18.575f, 20.607f, 20.925f)
                lineTo(18.765f, 21.796f)
                curveTo(17.347f, 20.116f, 14.847f, 19.0f, 12.0f, 19.0f)
                curveTo(9.152f, 19.0f, 6.653f, 20.116f, 5.235f, 21.796f)
                lineTo(3.394f, 20.924f)
                curveTo(5.136f, 18.575f, 8.338f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(14.761f, 2.0f, 17.0f, 4.239f, 17.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 12.689f, 14.878f, 14.882f, 12.217f, 14.995f)
                lineTo(12.0f, 15.0f)
                curveTo(9.238f, 15.0f, 7.0f, 12.761f, 7.0f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 4.311f, 9.122f, 2.118f, 11.783f, 2.005f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(10.402f, 4.0f, 9.096f, 5.249f, 9.005f, 6.824f)
                lineTo(9.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 11.657f, 10.343f, 13.0f, 12.0f, 13.0f)
                curveTo(13.598f, 13.0f, 14.904f, 11.751f, 14.995f, 10.176f)
                lineTo(15.0f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 5.343f, 13.657f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _user6Line!!
    }

private var _user6Line: ImageVector? = null
