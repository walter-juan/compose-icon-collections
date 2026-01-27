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

public val EditorGroup.Hand2: ImageVector
    get() {
        if (_hand2 != null) {
            return _hand2!!
        }
        _hand2 = Builder(name = "Hand2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 1.0f)
                curveTo(12.561f, 1.0f, 13.464f, 1.662f, 13.827f, 2.594f)
                curveTo(14.041f, 2.534f, 14.267f, 2.5f, 14.5f, 2.5f)
                curveTo(15.881f, 2.5f, 17.0f, 3.619f, 17.0f, 5.0f)
                verticalLineTo(6.05f)
                curveTo(17.162f, 6.017f, 17.329f, 6.0f, 17.5f, 6.0f)
                curveTo(18.881f, 6.0f, 20.0f, 7.119f, 20.0f, 8.5f)
                verticalLineTo(13.5f)
                curveTo(20.0f, 18.194f, 16.194f, 22.0f, 11.5f, 22.0f)
                curveTo(6.806f, 22.0f, 3.0f, 18.194f, 3.0f, 13.5f)
                verticalLineTo(11.5f)
                curveTo(3.0f, 10.119f, 4.119f, 9.0f, 5.5f, 9.0f)
                curveTo(5.671f, 9.0f, 5.838f, 9.017f, 6.0f, 9.05f)
                verticalLineTo(5.5f)
                curveTo(6.0f, 4.119f, 7.119f, 3.0f, 8.5f, 3.0f)
                curveTo(8.686f, 3.0f, 8.866f, 3.021f, 9.04f, 3.06f)
                curveTo(9.248f, 1.889f, 10.27f, 1.0f, 11.5f, 1.0f)
                close()
                moveTo(11.5f, 3.0f)
                curveTo(11.224f, 3.0f, 11.0f, 3.224f, 11.0f, 3.5f)
                verticalLineTo(11.0f)
                curveTo(11.0f, 11.552f, 10.552f, 12.0f, 10.0f, 12.0f)
                curveTo(9.448f, 12.0f, 9.0f, 11.552f, 9.0f, 11.0f)
                verticalLineTo(5.5f)
                curveTo(9.0f, 5.224f, 8.776f, 5.0f, 8.5f, 5.0f)
                curveTo(8.224f, 5.0f, 8.0f, 5.224f, 8.0f, 5.5f)
                verticalLineTo(13.5f)
                curveTo(8.0f, 14.052f, 7.552f, 14.5f, 7.0f, 14.5f)
                curveTo(6.448f, 14.5f, 6.0f, 14.052f, 6.0f, 13.5f)
                verticalLineTo(11.5f)
                curveTo(6.0f, 11.224f, 5.776f, 11.0f, 5.5f, 11.0f)
                curveTo(5.224f, 11.0f, 5.0f, 11.224f, 5.0f, 11.5f)
                verticalLineTo(13.5f)
                curveTo(5.0f, 17.09f, 7.91f, 20.0f, 11.5f, 20.0f)
                curveTo(15.09f, 20.0f, 18.0f, 17.09f, 18.0f, 13.5f)
                verticalLineTo(8.5f)
                curveTo(18.0f, 8.224f, 17.776f, 8.0f, 17.5f, 8.0f)
                curveTo(17.224f, 8.0f, 17.0f, 8.224f, 17.0f, 8.5f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 11.552f, 16.552f, 12.0f, 16.0f, 12.0f)
                curveTo(15.448f, 12.0f, 15.0f, 11.552f, 15.0f, 11.0f)
                verticalLineTo(5.0f)
                curveTo(15.0f, 4.724f, 14.776f, 4.5f, 14.5f, 4.5f)
                curveTo(14.224f, 4.5f, 14.0f, 4.724f, 14.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(14.0f, 11.552f, 13.552f, 12.0f, 13.0f, 12.0f)
                curveTo(12.448f, 12.0f, 12.0f, 11.552f, 12.0f, 11.0f)
                verticalLineTo(3.5f)
                curveTo(12.0f, 3.224f, 11.776f, 3.0f, 11.5f, 3.0f)
                close()
            }
        }
        .build()
        return _hand2!!
    }

private var _hand2: ImageVector? = null
