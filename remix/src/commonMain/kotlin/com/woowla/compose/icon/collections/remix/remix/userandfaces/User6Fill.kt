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

public val UserAndFacesGroup.User6Fill: ImageVector
    get() {
        if (_user6Fill != null) {
            return _user6Fill!!
        }
        _user6Fill = Builder(name = "User6Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                curveTo(17.0f, 12.761f, 14.761f, 15.0f, 12.0f, 15.0f)
                curveTo(9.238f, 15.0f, 7.0f, 12.761f, 7.0f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 4.239f, 9.238f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _user6Fill!!
    }

private var _user6Fill: ImageVector? = null
