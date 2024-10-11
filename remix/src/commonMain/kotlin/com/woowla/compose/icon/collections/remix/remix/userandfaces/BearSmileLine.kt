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

public val UserAndFacesGroup.BearSmileLine: ImageVector
    get() {
        if (_bearSmileLine != null) {
            return _bearSmileLine!!
        }
        _bearSmileLine = Builder(name = "BearSmileLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(14.209f, 17.0f, 16.0f, 15.209f, 16.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 14.105f, 13.105f, 15.0f, 12.0f, 15.0f)
                curveTo(10.895f, 15.0f, 10.0f, 14.105f, 10.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 15.209f, 9.791f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(6.5f, 2.0f)
                curveTo(4.015f, 2.0f, 2.0f, 4.015f, 2.0f, 6.5f)
                curveTo(2.0f, 7.857f, 2.601f, 9.073f, 3.549f, 9.898f)
                curveTo(3.194f, 10.866f, 3.0f, 11.911f, 3.0f, 13.0f)
                curveTo(3.0f, 17.971f, 7.029f, 22.0f, 12.0f, 22.0f)
                curveTo(16.971f, 22.0f, 21.0f, 17.971f, 21.0f, 13.0f)
                curveTo(21.0f, 11.911f, 20.806f, 10.866f, 20.451f, 9.898f)
                curveTo(21.399f, 9.073f, 22.0f, 7.857f, 22.0f, 6.5f)
                curveTo(22.0f, 4.015f, 19.985f, 2.0f, 17.5f, 2.0f)
                curveTo(15.874f, 2.0f, 14.45f, 2.862f, 13.66f, 4.153f)
                curveTo(13.122f, 4.052f, 12.566f, 4.0f, 12.0f, 4.0f)
                curveTo(11.434f, 4.0f, 10.878f, 4.052f, 10.34f, 4.153f)
                curveTo(9.55f, 2.862f, 8.126f, 2.0f, 6.5f, 2.0f)
                close()
                moveTo(4.0f, 6.5f)
                curveTo(4.0f, 5.119f, 5.119f, 4.0f, 6.5f, 4.0f)
                curveTo(7.58f, 4.0f, 8.503f, 4.686f, 8.852f, 5.649f)
                lineTo(9.17f, 6.527f)
                lineTo(10.068f, 6.27f)
                curveTo(10.68f, 6.094f, 11.328f, 6.0f, 12.0f, 6.0f)
                curveTo(12.672f, 6.0f, 13.32f, 6.094f, 13.932f, 6.27f)
                lineTo(14.83f, 6.527f)
                lineTo(15.148f, 5.649f)
                curveTo(15.497f, 4.686f, 16.42f, 4.0f, 17.5f, 4.0f)
                curveTo(18.881f, 4.0f, 20.0f, 5.119f, 20.0f, 6.5f)
                curveTo(20.0f, 7.433f, 19.489f, 8.248f, 18.728f, 8.679f)
                lineTo(17.914f, 9.138f)
                lineTo(18.318f, 9.981f)
                curveTo(18.755f, 10.894f, 19.0f, 11.917f, 19.0f, 13.0f)
                curveTo(19.0f, 16.866f, 15.866f, 20.0f, 12.0f, 20.0f)
                curveTo(8.134f, 20.0f, 5.0f, 16.866f, 5.0f, 13.0f)
                curveTo(5.0f, 11.917f, 5.245f, 10.894f, 5.682f, 9.981f)
                lineTo(6.086f, 9.138f)
                lineTo(5.272f, 8.679f)
                curveTo(4.511f, 8.248f, 4.0f, 7.433f, 4.0f, 6.5f)
                close()
            }
        }
        .build()
        return _bearSmileLine!!
    }

private var _bearSmileLine: ImageVector? = null
